package models;

public class BaseID {
    public String id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BaseID){
            BaseID base = (BaseID)obj;
            if(this.id.equals(base.id)){
                return true;
            }
        }
        return false;
        
    }
    
}
