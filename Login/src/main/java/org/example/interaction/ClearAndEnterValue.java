package org.example.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class ClearAndEnterValue implements Interaction {

    private final Target target;
    private final String value;

    public ClearAndEnterValue(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    public static ClearAndEnterValue intoField(Target target, String value) {
        return new ClearAndEnterValue(target, value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target), // enfocamos el campo
                net.serenitybdd.screenplay.actions.Enter.keyValues(Keys.chord(Keys.CONTROL, "a")).into(target), // Ctrl + A para seleccionar todo
                net.serenitybdd.screenplay.actions.Enter.keyValues(Keys.BACK_SPACE).into(target), // borrar con Backspace
                Enter.theValue(value).into(target) // ingresar nuevo valor
        );
    }
}
