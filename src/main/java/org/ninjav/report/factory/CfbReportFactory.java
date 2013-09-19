package org.ninjav.report.factory;

import java.io.PrintWriter;
import org.ninjav.report.engine.CfbDeliverServlet;
import org.ninjav.report.engine.CfbRenderFreemarker;
import org.ninjav.report.engine.CfbReport;
import org.ninjav.report.engine.Report;

public class CfbReportFactory implements ReportFactory {

    @Override
    public Report createReport() {
        CfbReport report = new CfbReport();
        report.setRenderBehavior(new CfbRenderFreemarker());
        report.setDeliverBehavior(new CfbDeliverServlet(new PrintWriter(System.out)));
        return report;
    }
}