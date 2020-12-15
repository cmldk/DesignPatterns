package CommandPattern;

import javax.crypto.Mac;

public class TestRemoteControl {

    public static void main(String... args){

        OutdoorLight outdoorLight = new OutdoorLight();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan();

        //Command command = new OutdoorLightOnCommand(outdoorLight);
        //Command command2 = new ArmSecurityCommand(new SecurityControl());

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0,new OutdoorLightOnCommand(outdoorLight),new OutdoorLightOffCommand(outdoorLight));
        remoteControl.setCommand(1,new StereoOnWithCDCommand(stereo),new StereoOffCommand(stereo));
        remoteControl.setCommand(2,new CeilingFanHighCommand(ceilingFan),null);

        remoteControl.buttonClicked(0,true);
        remoteControl.buttonClicked(1,true);
        remoteControl.buttonClicked(1,false);
        remoteControl.buttonClicked(2,true);
        remoteControl.undoButtonClicked();

        //For MacroCommand
        System.out.println("\n\nMacroCommand");
        OutdoorLightOnCommand onCommand = new OutdoorLightOnCommand(outdoorLight);
        StereoOnWithCDCommand onCommand1 = new StereoOnWithCDCommand(stereo);

        Command[] partyOn = new Command[2];
        partyOn[0] = onCommand;
        partyOn[1] = onCommand1;

        MacroCommand macroCommand = new MacroCommand(partyOn);
        remoteControl.setCommand(3,macroCommand,null);
        remoteControl.buttonClicked(3, true);

    }
}
