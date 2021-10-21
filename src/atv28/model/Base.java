package model;



public abstract class Base {

    public int id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Base){
            Base base = (Base)obj;
            if(this.id == base.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String msg = "Id: " + this.id;
        return msg;
    }




}
