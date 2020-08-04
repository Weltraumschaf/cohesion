package de.weltraumschaf.cohesion;

/**
 *
 */
final class OutInfo {
    final String errorMsg;
    final int importedRows;
    final boolean successfull;

    OutInfo(String errorMsg, int importedRows, boolean successfull) {
        this.errorMsg = errorMsg;
        this.importedRows = importedRows;
        this.successfull = successfull;
    }
}
