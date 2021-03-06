package de.fhg.iais.roberta.visitor.hardware;

import de.fhg.iais.roberta.syntax.action.expedition.LedBlinkAction;
import de.fhg.iais.roberta.syntax.action.expedition.LedDimAction;
import de.fhg.iais.roberta.syntax.action.expedition.LedGetAction;
import de.fhg.iais.roberta.syntax.action.expedition.LedSetAction;
import de.fhg.iais.roberta.syntax.lang.expr.ColorHexString;
import de.fhg.iais.roberta.visitor.hardware.actor.ILightVisitor;
import de.fhg.iais.roberta.visitor.hardware.sensor.ISensorVisitor;

/**
 * Interface to be used with the visitor pattern to traverse an AST (and generate code, e.g.).
 */
public interface IExpeditionVisitor<V> extends ISensorVisitor<V>, ILightVisitor<V> {

    public V visitColorHexString(ColorHexString<V> colorHexString);

    public V visitLedSetAction(LedSetAction<V> ledSetAction);

    public V visitLedBlinkAction(LedBlinkAction<V> ledBlinkAction);

    public V visitLedDimAction(LedDimAction<V> ledDimAction);

    public V visitLedGetAction(LedGetAction<V> ledGetAction);

}