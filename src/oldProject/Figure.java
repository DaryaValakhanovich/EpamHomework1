package oldProject;

import annotations.ThisCodeSmells;
import annotations.UseArrayList;

import java.util.List;

@ThisCodeSmells(reviewer = "Petya")
@ThisCodeSmells(reviewer = "Tanya")
public abstract class Figure {
    public abstract int findArea();

    @Deprecated
    public void doSmth(List list){
        //outdated code
    }

    @UseArrayList
    @SuppressWarnings("unused")
    public void doSmthBetter(List list){
        //better alternative to outdated code
    }
}