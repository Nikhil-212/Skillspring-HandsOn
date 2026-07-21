package com.cognizant.week2.mockito.voidmethods;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ReportServiceTest { @Test void writesReport() { FileWriter writer = Mockito.mock(FileWriter.class); doNothing().when(writer).write("Monthly report"); new ReportService(writer).createReport(); verify(writer).write("Monthly report"); } }
