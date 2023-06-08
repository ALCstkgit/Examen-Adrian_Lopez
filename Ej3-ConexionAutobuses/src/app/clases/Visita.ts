import { Autobus } from "./Autobus"
import { Conductor } from "./Conductor"
import { Lugar } from "./Lugar"

export class Visita{
    id:number = 0
    fvisita:Date = new Date()
    autobusVisita:Autobus = new Autobus()
    conductorVisita: Conductor = new Conductor()
    lugarVisita: Lugar = new Lugar()
}