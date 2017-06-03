JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
%.class: %.java
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	SFAgent.java \
        SFScenario.java \
        SFWaypoint.java \
        SFWall.java \
	SFVector.java \
	SFXMLReader/MainReader.java \
	SFXMLReader/XAddWaypoint.java \
	SFXMLReader/XAgent.java \
	SFXMLReader/XMLReader.java \
	SFXMLReader/XWall.java \
	SFXMLReader/XWaypoint.java

default: classes

all: classes



classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class