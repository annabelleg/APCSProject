APCSProject
===========

##APCS first term final project

####Premise of project:
 A name generator (can be used for picking baby names) based on criteria such as:
 
    - gender (primarily male, primarily female, or can be both)
    - how modern/old-fashioned it is
    - popularity
    - country of origin
    - how normal the name is (different from popularity--this is like how unusual the name is)

  We will use Processing or GUI to create a window where the user can enter their preferences (drop-down list for country of origin, sliding scale or radio buttons for 1-10 of things like popularity, etc). The user will click "Submit" and a list of the top name will come up that match their criteria. The names (and their values for each input) will be stored in a csv file. 

  We might also add an option for the user to input their own names (and the values for each input) to the csv file (this way they can add their own name, etc).
  
####CHRONOLOGICAL LIST OF UPDATES
######1/5/15
  - edited README to include the premise and specifics of the project
  - started Chronological List of Updates
  
###### 1/6/15
  - created basic GUI window opener thing (GUI.java, first commit)

###### 1/7/15
  - Mapped out the project GUI on paper
  - started csv's of names
  - added value for "unusualness" of a name
 
###### 1/8/15
  - Worked on the GUI:
    - created intro window, made buttons to bring you to the 2 options
    - made basic windows for Entering a name and Generating a name
  - so far, we have the very basic GUI stuff, and preliminary data in the csv files. We're going to add all our criteria to the csv's, finish all the GUI stuff, and learn how to get data from and add data to the csv's
  

###### 1/9/15
- updated GUIs:
  - turned our previous labels into uneditable textareas
  - added stuff to EnterName GUI to input criteria along with the name (male/female, unusualness, etc)
- added txt file of names in the Bible so we can see if name is in there

###### 1/12/15
- Aaron exhibited mastery of GUI-foo
- A.K.A. we fixed all the stuff with the radio buttons in the EnterName GUI
- started the code to get values from the user inputs and match them to a name in the csv (GetName.java) <-- (later on we basically put all this in the GenerateName code so it is kind of pointless but we'll keep it around for now just in case)
- created a Person class that contains an ArrayList of Objects that we will store our values in. We'll use this to compare what the user wants in a name to the actual values contained in the csv files.
- IN GenerateName.java:
  - we added all the buttons and such
  - added buttonVal() method to get the chosen text from a ButtonGroup
  - updated actionPerformed to create a new Person with the requested values when "Give me a name!" button is pressed (NOTE: this doesn't work quite yet)
  - reorganized some things so that they're private variables instead of local ones so we can use them later

###### 1/13/15
- added value for "old-fashioned-ness" to boys.csv
- cleaned up EnterNewName by making different JComponents private variables instead of local, added buttonVal() code, started rudimentary creation of a Person given the user inputs
- it looks like we weren't super productive today but we really were I promise!!

###### 1/14/15
- continued adding values to the CSV's
- created Finished.java, which is the window that pops up when you click the Submit buttons in EnterNewName and GenerateName and asks you what you want to do next
- wrote methods that collect the user-inputted data and adds it to the correct csv for EnterNewName <--not positive if this works yet so will be testing shortly
- UPDATE: IT WORKS PRAISE THE LORD GLORY HALLELUJAH
- added Old-Fashioned buttons, method to collect the user inputs, and rudimentary calaculation method to GenerateName

###### 1/15/15
- added method to load the values from the csv into an ArrayList of String arrays
- Changed the GUI layout of Main.java to be prettier
- Finished old-fashioned for the girl CSV

###### 1/16/15
- added more code to GenerateName to help load all the names into ArrayLists and such
- added the dropdown menu to choose country of origin to EnterNewName

###### 1/17/15
- deleted GetName.java because it was pointless
- fixed the GenerateName code that goes through the csv and stuff
  - added a code the find the match and return it <--haven't tested this yet but that will happen as soon as we write the code that uses the findMatch code and stuff!!
  - updated the actionPerformed code so that when you click the "Get Name!" button something actually happens
    - as of yet, that "something" is that it gives you an error, but that will be fixed soon!!
- updated the calculate() code so that it can take both Strings and Integers so that it can take into account things like country of origin and stuff

###### 1/18/15
- added dropdown menu for language of origin to GenerateName
  - however, we're getting the same error as we got last night: a NullPointerException that says there's no outputted value for the Gender radio buttons (i assume this extends to the other sets of radio buttons)
- fixed the error for EnterNewName that arose as a result of adding the JComboBox
- updated the calculation code so it actually works how we want it to (it didn't before)
- Made the EnterNewName GUI pretty
- added origin of all the names to the csv's
- added window that pops up if the name you're trying to enter is already in the csv file (Error.java)
- added code that checks if the name you're trying to add is already in the csv file
- HECK YEAH WE FINISHED THE GENERATENAME THING EXCEPT FOR IF YOU WANT A NAME THAT FITS BOTH BUT WE'LL FIX THAT SOON WOW I FEEL ACCOMPLISHED
  - we just need to fix it for if you want "Both"
  - and also have it return the top 3 values and some info about them (origin, meaning, etc) instead of just one
  - I'm so happy Mr. K

###### 1/19/15
- we are now a little less happy because we discovered we have a bug that the Origin of the name it searches for is automatically set to whatever thing it's defaulted to in the constructor, so now we have to fix that
- on the bright side, we made it so GenerateName can take "Both" as an option
- and we made the GUIs look prettier
- UPDATE: WE FIXED THE THING JK AARON FIXED THE THING I OWE HIM MY FIRSTBORN SON
- so basically what we're telling you is that we rock
 
###### 1/20/15
- made GenerateName return the TOP THREE names instead of just one
  - w0w
- added a "goodbye" button on GenerateName so you can get the heck outta there
- we're finished wahooooo
