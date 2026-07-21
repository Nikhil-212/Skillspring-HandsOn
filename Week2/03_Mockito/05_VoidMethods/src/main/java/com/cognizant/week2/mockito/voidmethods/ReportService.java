package com.cognizant.week2.mockito.voidmethods;

public class ReportService { private final FileWriter writer; public ReportService(FileWriter writer) { this.writer = writer; } public void createReport() { writer.write("Monthly report"); } }
