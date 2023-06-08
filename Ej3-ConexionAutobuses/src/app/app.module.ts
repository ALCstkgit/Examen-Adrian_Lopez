import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';
import { InfoAutobusComponent } from './info-autobus/info-autobus.component';
import { AutobusesService } from './servicios/autobuses.service';
import { VisitasService } from './servicios/visitas.service';
import { PrincipalComponent } from './principal/principal.component';

@NgModule({
  declarations: [
    AppComponent,
    InfoAutobusComponent,
    PrincipalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [AutobusesService,VisitasService],
  bootstrap: [AppComponent]
})
export class AppModule { }
