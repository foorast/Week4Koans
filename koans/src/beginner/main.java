package beginner;

public class main {

    public static void main(String[] args) {
        AboutArrays arrays = new AboutArrays();
        AboutEquality equality = new AboutEquality();
        AboutConditionals conditionals = new AboutConditionals();
        AboutConstructors constructors = new AboutConstructors();
        AboutEnums enums = new AboutEnums();
        AboutExceptions exceptions = new AboutExceptions();
        AboutInheritance inheritance = new AboutInheritance();
        AboutKoans koans = new AboutKoans();
        AboutLoops loops = new AboutLoops();
        AboutMethodPreference methodPreference = new AboutMethodPreference();
        AboutObjects objects = new AboutObjects();
        AboutPrimitives primitives = new AboutPrimitives();

        arrays.arraysDoNotConsiderElementsWhenEvaluatingEquality();
        arrays.cloneEqualityIsNotRespected();
        arrays.arraysHelperClassEqualsMethodConsidersElementsWhenDeterminingEquality();
        arrays.anArraysHashCodeMethodDoesNotConsiderElements();
        arrays.arraysAreMutable();
        arrays.arraysAreIndexedAtZero();
        arrays.arrayIndexOutOfBounds();
        arrays.arrayLengthCanBeChecked();

        conditionals.basicIf();
        conditionals.basicIfElse();
        conditionals.basicIfElseIfElse();
        conditionals.nestedIfsWithoutCurlysAreReallyMisleading();
        conditionals.ifAsIntended();
        conditionals.basicSwitchStatement();
        conditionals.switchStatementFallThrough();
        conditionals.switchStatementCrazyFallThrough();
        conditionals.switchStatementConstants();
        conditionals.switchStatementSwitchValues();
        conditionals.shortCircuit();
        conditionals.bitwise();

        constructors.simpleConstructorOrder();
        constructors.complexConstructorOrder();

        enums.basicEnums();
        enums.basicEnumsAccess();
        enums.enumsWithAttributes();
        enums.enumsWithMethods();

        equality.doubleEqualsTestsIfTwoObjectsAreTheSame();
        equality.equalsMethodByDefaultTestsIfTwoObjectsAreTheSame();
        equality.equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqual();
        equality.equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqualExample();
        equality.objectsNeverEqualNull();

        exceptions.catchCheckedExceptions();
        exceptions.useFinally();
        exceptions.finallyWithoutCatch();
        exceptions.finallyIsAlwaysRan();
        exceptions.returnInFinallyBlock();
        exceptions.catchUncheckedExceptions();
        exceptions.catchOrder();
        exceptions.failArgumentValidationWithAnIllegalArgumentException();

        inheritance.methodOverloading();
        inheritance.methodOverloadingUsingPolymorphism();
        inheritance.inheritanceHierarchy();
        inheritance.deeperInheritanceHierarchy();
        inheritance.overriddenMethodsMayReturnSubtype();

        koans.findAboutKoansFile();
        koans.definitionOfKoanCompletion();

        loops.basicForLoop1();
        loops.basicForLoop2();
        loops.basicForLoop3();
        loops.basicForLoop4();
        loops.basicForLoop5();
        loops.basicForLoopWithTwoVariables1();
        loops.nestedLoops();
        loops.extendedForLoop();
        loops.whileLoop();
        loops.doLoop();
        loops.extendedForLoopBreak();
        loops.extendedForLoopContinue();

        methodPreference.methodPreferenceInt();
        methodPreference.methodPreferenceInteger();
        methodPreference.methodPreferenceLong();
        methodPreference.methodPreferenceBoxedLong();
        methodPreference.methodPreferenceDouble();
        methodPreference.methodPreferenceMore();

        objects.newObjectInstancesCanBeCreatedDirectly();
        objects.allClassesInheritFromObject();
        objects.objectToString();
        objects.toStringConcatenates();
        objects.toStringIsTestedForNullWhenInvokedImplicitly();

        primitives.wholeNumbersAreOfTypeInt();
        primitives.primitivesOfTypeIntHaveAnObjectTypeInteger();
        primitives.integersHaveAFairlyLargeRange();
        primitives.integerSize();
        primitives.wholeNumbersCanAlsoBeOfTypeLong();
        primitives.primitivesOfTypeLongHaveAnObjectTypeLong();
        primitives.longsHaveALargerRangeThanInts();
        primitives.longSize();
        primitives.wholeNumbersCanAlsoBeOfTypeShort();
        primitives.primitivesOfTypeShortHaveAnObjectTypeShort();
        primitives.shortsHaveASmallerRangeThanInts();
        primitives.shortSize();
        primitives.wholeNumbersCanAlsoBeOfTypeByte();
        primitives.primitivesOfTypeByteHaveAnObjectTypeByte();
        primitives.bytesHaveASmallerRangeThanShorts();
        primitives.byteSize();
        primitives.wholeNumbersCanAlsoBeOfTypeChar();
        primitives.singleCharactersAreOfTypeChar();
        primitives.primitivesOfTypeCharHaveAnObjectTypeCharacter();
        primitives.charsCanOnlyBePositive();
        primitives.charSize();
        primitives.decimalNumbersAreOfTypeDouble();
        primitives.decimalNumbersAreOfTypeDouble();
        primitives.primitivesOfTypeDoubleCanBeDeclaredWithoutTheDecimalPoint();
        primitives.primitivesOfTypeDoubleCanBeDeclaredWithExponents();
        primitives.primitivesOfTypeDoubleHaveAnObjectTypeDouble();
        primitives.doublesHaveALargeRange();
        primitives.doubleSize();
        primitives.decimalNumbersCanAlsoBeOfTypeFloat();
    }
}
