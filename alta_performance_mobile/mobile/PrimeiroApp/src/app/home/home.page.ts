
import { Component } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent, IonButton } from '@ionic/angular';

@Component({
selector: 'app-home',
templateUrl: 'home.page.html',
styleUrls: ['home.page.scss'],
imports: [IonHeader, IonToolbar, IonTitle, IonContent, IonButton],
})
export class HomePage {
// nós programa aqui, bença
// atributos -> variáveis
nome:string = 'Laysa'
idade = 18
url = 'https://picsum.photos/536/354'
cor = '#880088'
constructor() {}
// métodos -> funções
cumprimenta(){
	return `oi, ${this.nome}!`
}
mudaCor(){
if(this.cor == '#880088'){
    this.cor = 'black'
}else{
    this.cor = '#880088'
}
}
}
