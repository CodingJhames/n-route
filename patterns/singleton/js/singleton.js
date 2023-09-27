
class Singleton {

    static getInstance(){
        return Singleton.instance;
    }

    constructor(){
        this.random = Math.random();

        console.log("entrando a constructor");
        if ( Singleton.instance ){
            return Singleton.instance;
        }

        console.log("no existe y se crea");
        Singleton.instance = this;
    }
}

const singleton = new Singleton();
const singletonTwo = new Singleton();
const singletonThree = new Singleton();
console.log( singleton.random );
console.log( singletonTwo.random );
console.log( singletonThree.random  );
console.log( singleton === singletonTwo );
console.log( singletonThree === singletonTwo );