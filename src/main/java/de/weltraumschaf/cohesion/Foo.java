package de.weltraumschaf.cohesion;

import java.util.List;
import java.util.Map;

/**
 *
 */
final class Foo {
    // "outInfo" with keys "errorMsg" and "importedRows"
    boolean importData(String serverUrl, String user, String password, String sourceTable, String targetTable, int startRow, int endRow, List<String> columnNames, Map<String, Object> outInfo) {
        return true;
    }
}
