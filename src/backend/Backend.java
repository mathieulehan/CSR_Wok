package backend;

import database.api.Database;
import database.api.impl.Restaurant;

public class Backend
{
    /** Database.*/
    private Database database_;

    public Backend()
    {
        database_ = new Restaurant();
    }

    public Database getDatabase()
    {
        return database_;
    }

}
