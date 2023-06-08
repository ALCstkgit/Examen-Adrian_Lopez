import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InfoAutobusComponent } from './info-autobus/info-autobus.component';
import { PrincipalComponent } from './principal/principal.component';

const routes: Routes = [{path:":matricula",component:InfoAutobusComponent},
{path:"",component:PrincipalComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
