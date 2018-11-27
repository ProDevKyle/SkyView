package com.company;

public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int idx = 0;
        int row = 0;
        while (row!=numRows)
        {
            if (row%2 == 0)
            {
                for (int i = 0; i < numCols; i++)
                {
                    view[row][i] = scanned[idx];
                    idx++;
                }
            }
            else
            {
                for (int i = numCols - 1; i > -1; i--)
                {
                    view[row][i] = scanned[idx];
                    idx++;
                }
            }
            row++;
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double total = 0;
        int num = 0;
        for (int i = startRow; i < endRow; i++)
        {
            for (int j = startCol; j < endCol; j++)
            {
                total = total + view[i][j];
                num++;
            }
        }
        return (total/num);
    }

    public String toString(int numRows, int numCols)
    {
        String str = "";
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numCols; j++)
            {
                str = str + view[i][j] + " ";
            }
            str = str + "\n";
        }
        return str;
    }
}
