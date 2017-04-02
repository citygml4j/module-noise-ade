# module-noise-ade
CityGML NoiseADE module for citygml4j.

This is a citygml4j module for the CityGML 2.0 Noise Application Domain Extension (ADE). The module is implemented against the `ADEContext` extension of citygml4j that is currently being developed in the citygml4j [ade-context branch](https://github.com/citygml4j/citygml4j/tree/ade-context). In contrast to the generic ADE support of citygml4j, which maps ADE content onto a Java DOM representation, the `ADEContext` approach allows for extending the citygml4j object model with new ADE classes. JAXB is used for parsing and writing ADE-enriched CityGML datasets. The required JAXB classes mapping the ADE XML Schema can easily be generated with the [ade-xjc](https://github.com/citygml4j/ade-xjc) compiler shipped with citygml4j. 

## How to use the module
In order to use or compile the source code, the citygml4j library and its dependencies from the [ade-context branch](https://github.com/citygml4j/citygml4j/tree/ade-context) must be on the classpath. If packaged as a JAR file, the module can be registered with the citygml4j library to build a NoiseADE application. The `ADEContext` extension is designed to register multiple ADE modules at the same time.

**Note** that the `ADEContext` extension is an ongoing development. The NoiseADE module is used to test and validate the `ADEContext` development. It can therefore NOT be considered stable.

## License
The NoiseADE module is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0). See the `LICENSE` file for more details.

## More information
The CityGML NoiseADE has been developed for exchanging 3d geodata for Noise Immission Simulation in the context of the Environmental Noise Directive of the European Union. The base model of CityGML has been augmented with new thematic attributes and feature types that are required for the noise simulation using the CityGML ADE extension mechanism. The CityGML NoiseADE is described in detail in the [CityGML 2.0 specification document](https://portal.opengeospatial.org/files/?artifact_id=47842) (see Annex H). 

[OGC CityGML](http://www.opengeospatial.org/standards/citygml) is an open data model and XML-based format for the storage and exchange of semantic 3D city models. It is an application schema for the [Geography Markup Language version 3.1.1 (GML3)](http://www.opengeospatial.org/standards/gml), the extendible international standard for spatial data exchange issued by the Open Geospatial Consortium (OGC) and the ISO TC211. The aim of the development of CityGML is to reach a common definition of the basic entities, attributes, and relations of a 3D city model.

CityGML is an international OGC standard and can be used free of charge.
