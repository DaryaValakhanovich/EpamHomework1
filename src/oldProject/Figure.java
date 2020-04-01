package oldProject;

import java.util.List;

public abstract class Figure {
    public abstract int findArea();

    @Deprecated
    public void doSmth(List list){
        //outdated code
    }

    @SuppressWarnings("unused")
    public void doSmthBetter(List list){
        //better alternative to outdated code
    }
}