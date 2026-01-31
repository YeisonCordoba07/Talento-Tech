import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  
    constructor(private http: HttpClient){

    }

    getUsers(){
        const variable = this.http.get<any>("https://rickandmortyapi.com/api/character").pipe(
        map(response => response.results)
      );

        return variable
        
    }
}
