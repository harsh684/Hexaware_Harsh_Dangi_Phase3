import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Languages } from '../models/Languages.model';

@Injectable({
  providedIn: 'root'
})
export class LanguageService {

  constructor(private http:HttpClient) { }

  add(language:Languages){
    this.http.post<Languages>("http://localhost:8080/api/languages/insert",language);
  }

  remove(languageId:number){
    this.http.delete<string>("http://localhost:8080/api/languages/remove/"+languageId);
  }
}
