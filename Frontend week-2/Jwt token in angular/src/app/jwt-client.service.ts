import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JwtClientService {

  constructor(private http:HttpClient) { }


    baseURL:string = 'http://localhost:8080/';

    getGeneratedToken(requestBody: any){

        return this.http.post(this.baseURL+"api/register/authenticate",requestBody,{responseType: 'text' as 'json'});

    }

    authorizationTest(token:any){

          let tokenString = "Bearer "+token;

         const headers =  new HttpHeaders({
          'Content-Type': 'application/json',
          'Access-Control-Allow-Origin': 'http://localhost:4200' // Ensure this matches your Spring Boot CORS configuration
        }).set("Authorization",tokenString);


        return this.http.get(this.baseURL+"api/employer/v1/viewapplications",{headers,responseType:'text' as 'json'});

    }


}
