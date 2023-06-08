import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Visita } from '../clases/Visita';

@Injectable({
  providedIn: 'root'
})
export class VisitasService {
  url : string = "http://localhost:8080/visitas"

  constructor(private httpClient: HttpClient) { }

  findAll():Observable<Visita[]>{
    return this.httpClient.get<Visita[]>(this.url);
  }

  insertVisita(v:Visita):Observable<Object>{
    return this.httpClient.post(this.url,v)
  }
}
