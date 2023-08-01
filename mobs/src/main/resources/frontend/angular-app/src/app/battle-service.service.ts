import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';

const API_URL = 'http:/localhost:8080/battle'

@Injectable({
  providedIn: 'root'
})
export class BattleServiceService {
  
  
  constructor(private http: HttpClient) { 
  }

  getServerMessage(): Observable<any>{
    return this.http.get(API_URL, {responseType: 'text'});
  }

}
