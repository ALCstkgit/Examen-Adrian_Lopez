import { Component } from '@angular/core';
import { Autobus } from '../clases/Autobus';
import { AutobusesService } from '../servicios/autobuses.service';

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.css']
})
export class PrincipalComponent {
  autobuses: Autobus[] = []

  constructor(private autobusService:AutobusesService){}

  ngOnInit(){
    this.autobusService.findAll().subscribe(data=>this.autobuses=data)
  }
}
