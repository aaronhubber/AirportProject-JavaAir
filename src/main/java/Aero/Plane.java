package Aero;

public class Plane {

    private TypeOfPlane typeOfPlane;

    public Plane(TypeOfPlane typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public TypeOfPlane getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(TypeOfPlane typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }
}
