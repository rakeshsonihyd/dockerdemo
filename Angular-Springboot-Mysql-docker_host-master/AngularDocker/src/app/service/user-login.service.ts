import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { UserLogin } from '../commons/user-login';

@Injectable({
  providedIn: 'root'
})
export class UserLoginService {
  private baseURL="http://localhost:8081/login/";

  constructor(private httpClient: HttpClient) { }

  userInformation():Observable<UserLogin[]>{

    const searchUrl =`${this.baseURL}getAllDetails`
    return this.httpClient.get<UserLogin[]>(searchUrl).pipe(
      map(response => response)
      
    );    
  
  }
  



}
