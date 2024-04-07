package design_pattern.Structural_Patterns.Facade;

// principle of least knowledge; talk only to your immediate friends.
public class PrincipleOfLeastKnowledge {
}


// DOUBLE DEPENDENCY.

//public float getTemp(){
//    return station.getThermometer().getTemperature();
//}



// WE WANT STATION TO IMPLEMENT getTemperature for us.
// station can only talk to his compose objects and their functions or objects. not the friends of that objects.



// accepted
/*
public float gettemp(){
    return station.gettemperature();

}
 */

/*
MORE DEPENDENCY MEANS MORE COUPLE CODE, MEANS MORE CHANGES IN FUTURE IF SOMETHING CHANGE OCCURS IN DEPENDENT CLASSES.
 */