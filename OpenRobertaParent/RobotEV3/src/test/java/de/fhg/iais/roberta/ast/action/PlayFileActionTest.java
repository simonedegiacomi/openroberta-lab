package de.fhg.iais.roberta.ast.action;

import org.junit.Assert;
import org.junit.Test;

import de.fhg.iais.roberta.syntax.action.sound.PlayFileAction;
import de.fhg.iais.roberta.transformer.Jaxb2ProgramAst;
import de.fhg.iais.roberta.util.test.ev3.HelperEv3ForXmlTest;

public class PlayFileActionTest {
    private final HelperEv3ForXmlTest h = new HelperEv3ForXmlTest();

    @Test
    public void make() throws Exception {
        String a = "BlockAST [project=[[Location [x=1, y=86], PlayFileAction [1]]]]";
        Assert.assertEquals(a, this.h.generateTransformerString("/ast/actions/action_PlayFile.xml"));
    }

    @Test
    public void getFileName() throws Exception {
        Jaxb2ProgramAst<Void> transformer = this.h.generateTransformer("/ast/actions/action_PlayFile.xml");
        PlayFileAction<Void> pfa = (PlayFileAction<Void>) transformer.getTree().get(0).get(1);
        Assert.assertEquals("1", pfa.getFileName());
    }

    @Test
    public void reverseTransformatin1() throws Exception {
        this.h.assertTransformationIsOk("/ast/actions/action_PlayFile1.xml");
    }
}
