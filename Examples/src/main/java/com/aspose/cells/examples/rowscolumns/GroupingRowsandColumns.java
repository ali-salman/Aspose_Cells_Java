package com.aspose.cells.examples.rowscolumns;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class GroupingRowsandColumns {

    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GroupingRowsandColumns.class);

        //Instantiating a Workbook object
        Workbook workbook = new Workbook(dataDir + "workbook.xls");

        //Accessing the first worksheet in the Excel file
        Worksheet worksheet = workbook.getWorksheets().get(0);
        Cells cells = worksheet.getCells();

        //Grouping first six rows (from 0 to 5) and making them hidden by passing true
        cells.groupRows(4, 9, true);

        //Grouping first three columns (from 0 to 2) and making them hidden by passing true
        cells.groupColumns(1, 3, true);

        //Setting SummaryRowBelow property to false
        worksheet.getOutline().SummaryRowBelow = false;

        //Setting SummaryColumnRight property to false
        worksheet.getOutline().SummaryColumnRight = true;

        //Saving the modified Excel file in default (that is Excel 2003) format
        workbook.save(dataDir + "workbook.out.xls");

        //Print message
        System.out.println("Rows and Columns grouped successfully.");
    }
}
