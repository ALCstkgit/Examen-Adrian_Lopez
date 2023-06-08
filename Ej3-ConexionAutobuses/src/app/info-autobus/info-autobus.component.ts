import { Component } from '@angular/core';
import { Autobus } from '../clases/Autobus';
import { HttpClient } from '@angular/common/http';
import { AutobusesService } from '../servicios/autobuses.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-info-autobus',
  templateUrl: './info-autobus.component.html',
  styleUrls: ['./info-autobus.component.css']
})
export class InfoAutobusComponent {
  bus:Autobus = new Autobus
  matricula:string
  constructor(private autobusService:AutobusesService, private activarRuta: ActivatedRoute){
    this.matricula = ""
  }

  ngOnInit(){
    this.matricula = this.activarRuta.snapshot.params["matricula"]
    this.autobusService.findAutobus(this.matricula).subscribe(data=>this.bus=data)
  }
}
