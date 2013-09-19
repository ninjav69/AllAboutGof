package org.ninjav.report.factory;

import org.ninjav.report.engine.ExceptionReport;
import org.ninjav.report.engine.Report;

public class ExceptionReportFactory implements ReportFactory {

    @Override
    public Report createReport() {
        return new ExceptionReport();
    }
}