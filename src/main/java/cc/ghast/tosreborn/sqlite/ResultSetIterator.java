package cc.ghast.tosreborn.sqlite;

import java.sql.ResultSet;

public interface ResultSetIterator {
    void next(ResultSet rs) throws Exception;
}
