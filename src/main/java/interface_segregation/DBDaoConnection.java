package interface_segregation;

public class DBDaoConnection implements DBInterface,DAOInterface{


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
    public void deleteRecord() {

    }
}
