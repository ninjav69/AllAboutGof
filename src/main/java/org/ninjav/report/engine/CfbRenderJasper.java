package org.ninjav.report.engine;

public class CfbRenderJasper implements CfbRenderBehavior {

    /**
     *
     * @param report
     */
    @Override
    public void render(CfbReport report) {
        report.setRenderBuffer("Rendering CFB Report via Jasper Reports");
    }
}