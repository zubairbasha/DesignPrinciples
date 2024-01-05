package interface_segregation;

public class BadDaoCOnnection implements  BadDaoInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void closeConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
    //This is not neccessary. As Database doesnot open any file. As we are forcing the Client to implement
        //this method
        throw new UnsupportedOperationException("Open file not supported");
    }

    @Override
    public void deleteRecord() {

    }
}
