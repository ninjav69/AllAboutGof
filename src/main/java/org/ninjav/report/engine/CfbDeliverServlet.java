package org.ninjav.report.engine;

import java.io.PrintWriter;

public class CfbDeliverServlet implements CfbDeliverBehavior {

    private PrintWriter out;

    public CfbDeliverServlet(PrintWriter out) {
        this.out = out;
    }

    /**
     *
     * @param report
     */
    @Override
    public void deliver(CfbReport report) {
        out.println("Deliver via servlet output stream: " + report.getRenderBuffer());
    }
}