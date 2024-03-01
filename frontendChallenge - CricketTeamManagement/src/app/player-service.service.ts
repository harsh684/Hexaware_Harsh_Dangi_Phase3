import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from './player.model';

@Injectable({
  providedIn: 'root'
})
export class PlayerServiceService {

  requestURL= 'http://localhost:8080/api/players/'

  constructor(private http:HttpClient) { }

  getPlayers():Observable<Player[]>{

    const headers =  new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': 'http://localhost:4200'
    });

    return this.http.get<Player[]>(this.requestURL+'getall',{headers});
  }

  getByRole(role:string){
    const headers =  new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': 'http://localhost:4200'
    });

    return this.http.get<Player[]>(this.requestURL+'getbyrole/'+role,{headers});

    // .subscribe
    // ((res)=>{
    //   console.log(res);
    // });
  }


  deletePlayer(playerId:number){
    const headers =  new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': 'http://localhost:4200'
    });

    return this.http.delete<string>(this.requestURL+'delete/'+playerId,{headers});
  }

}
