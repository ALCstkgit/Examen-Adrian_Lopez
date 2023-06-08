import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Autobus } from '../clases/Autobus';

@Injectable({
  providedIn: 'root'
})
export class AutobusesService {
  url : string = "http://localhost:8080/autobuses"

  constructor(private httpClient: HttpClient) { }

  findAll():Observable<Autobus[]>{
    return this.httpClient.get<Autobus[]>(this.url);
  }

  findAutobus(nombre: string):Observable<Autobus>{
    return this.httpClient.get<Autobus>(`${this.url}/${nombre}`)
  }
}
