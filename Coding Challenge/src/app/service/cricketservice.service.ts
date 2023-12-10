import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CricketserviceService {

  constructor(private http:HttpClient) { }


    baseURL:string = 'http://localhost:8282/api/cricket/';

    delete(name:string,team:string):Observable<string>{

      return  this.http.delete<string>(this.baseURL+`deletebyrole/${name}/${team}`);

    }

}
