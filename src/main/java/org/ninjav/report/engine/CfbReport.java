package org.ninjav.report.engine;

import java.util.logging.Logger;

public class CfbReport extends Report {

    private static final Logger LOG = Logger.getLogger(CfbReport.class.getName());
    private CfbRenderBehavior renderBehavior;
    private CfbDeliverBehavior deliverBehavior;
    private String renderBuffer;

    public String getRenderBuffer() {
        return renderBuffer;
    }

    public void setRenderBuffer(String renderBuffer) {
        this.renderBuffer = renderBuffer;
    }

    public CfbRenderBehavior getRenderBehavior() {
        return renderBehavior;
    }

    public void setRenderBehavior(CfbRenderBehavior renderBehavior) {
        this.renderBehavior = renderBehavior;
    }

    public CfbDeliverBehavior getDeliverBehavior() {
        return deliverBehavior;
    }

    public void setDeliverBehavior(CfbDeliverBehavior deliverBehavior) {
        this.deliverBehavior = deliverBehavior;
    }

    @Override
    public void init() {
        LOG.info("Init CFB");
    }

    @Override
    public void fill() {
        LOG.info("Fill CFB");
    }

    @Override
    public void render() {
        if (renderBehavior != null) {
            renderBehavior.render(this);
        }
    }

    @Override
    public void deliver() {
        if (deliverBehavior != null) {
            deliverBehavior.deliver(this);
        }
    }
}