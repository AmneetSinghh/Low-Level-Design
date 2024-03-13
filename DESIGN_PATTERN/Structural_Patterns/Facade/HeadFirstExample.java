package design_pattern.Structural_Patterns.Facade;

// see the example from HEAD FIRST DESIGN PATTERNS.
public class HeadFirstExample {

}

// we only need to expose interface to outer world.


// in phonepe we only expose interface to outer world/client so that they can use.
// We don't want them to use our internal low level code to see, so we decouple them using facade interfaces.
interface HomeThreaterI{
    void watchmovie();
    void endMovie();
    void listenRadio();
    void endRadio();
}



// one layer above low layer facade layer, that we expose.
// in more complex systems we can have more then one layers of facade, to make expose less things to client
class HomeThreaterFacade{

    public void watchMovie() {
        // lots of operations.
//        poppper.on();
//        popper.pop();
//        lights.dim();
//        screen.down();
//        projector.on();
//        projecter.widescreenMode();
//        amp.on();
//        player.on();
//        player.playMovie();
    }
    public void endMovie(){
        // lots of operations.
        // lots of operations.
//        poppper.off();
//        popper.unpop();
//        lights.undim();
//        screen.up();
//        projector.off();
//        projecter.widescreenModeOff();
//        amp.off();
//        player.off();
//        player.stopMovie();
    }
    public void listenToRadio(){
        // lots of operations.
    }
    public void endRadio(){
        // lots of operations.
    }
}




// low level code. we not want the client for watching movie to use these 10 functions, so we add facade layer on top of it.
class popper{

    // lots of compositions and methods.
}


class amplifier{
    // lots of compositions and methods.

}

class lights{
    // lots of compositions and methods.

}

class screenplayer{
    // lots of compositions and methods.

}

class radio{
    // lots of compositions and methods.

}


class projector{
    // lots of compositions and methods.

}

// complex set of classes  : Low layer.

