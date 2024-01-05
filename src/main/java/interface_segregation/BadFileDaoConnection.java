package interface_segregation;

public class BadFileDaoConnection implements BadDaoInterface{
    @Override
    public void openConnection() {
        //Not neccessary
        throw new UnsupportedOperationException("Open file not supported");
    }

    @Override
    public void closeConnection() {
        throw new UnsupportedOperationException("Open file not supported");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
