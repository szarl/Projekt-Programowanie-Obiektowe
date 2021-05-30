package Jcode;

import java.io.File;

public interface Data {
    public void creatFile();
    public boolean add();
    public boolean delete();
    public String printout();
    public void sort();
    public void open();
}

class Archiwizacja implements Data{
    private File file;
    private String data;
    private Main scan = new Main();

    @Override
    public void creatFile() {

    }

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public String printout() {
        return null;
    }

    @Override
    public void sort() {

    }

    @Override
    public void open() {

    }
}