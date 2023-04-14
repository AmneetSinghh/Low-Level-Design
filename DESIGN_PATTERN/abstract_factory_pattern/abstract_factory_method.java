package DESIGN_PATTERN.abstract_factory_pattern;

public class abstract_factory_method {
}
//https://refactoring.guru/design-patterns/abstract-factory

// we have taken exmaple from guru refractorying desing patterns.

//// The abstract factory interface declares a set of methods that
//// return different abstract products. These products are called
//// a family and are related by a high-level theme or concept.
//// Products of one family are usually able to collaborate among
//// themselves. A family of products may have several variants,
//// but the products of one variant are incompatible with the
//// products of another variant.
//interface GUIFactory is
//        method createButton():Button
//        method createCheckbox():Checkbox
//
//
//// Concrete factories produce a family of products that belong
//// to a single variant. The factory guarantees that the
//// resulting products are compatible. Signatures of the concrete
//// factory's methods return an abstract product, while inside
//// the method a concrete product is instantiated.
//class WinFactory implements GUIFactory is
//        method createButton():Button is
//        return new WinButton()
//        method createCheckbox():Checkbox is
//        return new WinCheckbox()
//
//// Each concrete factory has a corresponding product variant.
//class MacFactory implements GUIFactory is
//        method createButton():Button is
//        return new MacButton()
//        method createCheckbox():Checkbox is
//        return new MacCheckbox()
//
//
//// Each distinct product of a product family should have a base
//// interface. All variants of the product must implement this
//// interface.
//interface Button is
//        method paint()
//
//// Concrete products are created by corresponding concrete
//// factories.
//class WinButton implements Button is
//        method paint() is
//// Render a button in Windows style.
//
//class MacButton implements Button is
//        method paint() is
//// Render a button in macOS style.
//
//// Here's the base interface of another product. All products
//// can interact with each other, but proper interaction is
//// possible only between products of the same concrete variant.
//interface Checkbox is
//        method paint()
//
//class WinCheckbox implements Checkbox is
//        method paint() is
//// Render a checkbox in Windows style.
//
//class MacCheckbox implements Checkbox is
//        method paint() is
//// Render a checkbox in macOS style.
//
//
//// The client code works with factories and products only
//// through abstract types: GUIFactory, Button and Checkbox. This
//// lets you pass any factory or product subclass to the client
//// code without breaking it.
//class Application is
//        private field factory: GUIFactory
//private field button: Button
//        constructor Application(factory: GUIFactory) is
//        this.factory = factory
//        method createUI() is
//        this.button = factory.createButton()
//        method paint() is
//        button.paint()
//
//
//// The application picks the factory type depending on the
//// current configuration or environment settings and creates it
//// at runtime (usually at the initialization stage).
//class ApplicationConfigurator is
//        method main() is
//        config = readApplicationConfigFile()
//
//        if (config.OS == "Windows") then
//        factory = new WinFactory()
//        else if (config.OS == "Mac") then
//        factory = new MacFactory()
//        else
//        throw new Exception("Error! Unknown operating system.")
//
//        Application app = new Application(factory)