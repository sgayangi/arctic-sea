# Arctic Sea [![Build Status](https://travis-ci.org/52North/arctic-sea.svg)](https://travis-ci.org/52North/arctic-sea) [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/arctic-sea.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea) [![Join the chat at https://gitter.im/52North/arctic-sea](https://badges.gitter.im/52North/arctic-sea.svg)](https://gitter.im/52North/arctic-sea) [![Total alerts](https://img.shields.io/lgtm/alerts/g/52North/arctic-sea.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/52North/arctic-sea/alerts/) [![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/52North/arctic-sea.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/52North/arctic-sea/context:java)


## Description

### 52°North's backbone for OGC services, clients and middleware

**52°North's Arctic Sea is a framework for developing OGC services, clients and middleware sharing concepts for encoding and decoding of different formats and encodings, workflows and configuration.**

The Arctic Sea is stack of projects (all named after islands that are more or less in the arctic sea) that eases the development of OGC related services (such as the 52°North implementation of the OGC [SOS](https://github.com/52North/SOS) and [WPS](https://github.com/52North/javaPS)), clients and middleware. It compromises the following modules.
<p align="center">
<img src="https://github.com/52North/arctic-sea/raw/master/etc/overview.png" width='60%'/>
</p>


#### Iceland [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/iceland.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:iceland*%20and%20p:jar)

Iceland is a service framework that enables the development of OGC RPC based services. It features bindings for KVP, POX, SOAP, as well as JSON-based bindings, and facilitates the rapid development of modular services that are easily configured using Faroe. Svalbard is used for request parsing and response generation.

#### Svalbard [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/svalbard.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:svalbard*%20and%20p:jar)

Svalbard consists of various decoders and encoders for OGC models like [SensorML](http://www.opengeospatial.org/standards/sensorml), [O&M](http://www.opengeospatial.org/standards/om) or [SWE Common](http://www.opengeospatial.org/standards/swecommon), service interfaces like [SOS](http://www.opengeospatial.org/standards/sos) or [WPS](http://www.opengeospatial.org/standards/wps) and a framework for developing these. This enables the creation of decoupled and reusable encoders and decoders for various encodings (like XML, JSON or NetCDF). The object models that are used can be found in 52°North Shetland and are shared accross 52°North components.

#### Faroe [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/faroe.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:faroe*%20and%20p:jar)

Faroe is a configuration API currently featuring a JSON and a SQLite backend. It enables the injection and automatic configuration of settings of various types in classes, including a Spring `BeanPostprocessor`.

#### Shetland [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/shetland.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:shetland*%20and%20p:jar)

Shetland compromises classes for OGC models like [SensorML](http://www.opengeospatial.org/standards/sensorml), [O&M](http://www.opengeospatial.org/standards/om) or [SWE Common](http://www.opengeospatial.org/standards/swecommon) and various service requests and responses. These are shared accross different service implementations.

#### Jan Mayen [![Maven Central](https://img.shields.io/maven-central/v/org.n52.arctic-sea/janmayen.svg)](https://search.maven.org/search?q=g:org.n52.arctic-sea%20and%20a:janmayen*%20and%20p:jar)

Jan Mayen contains various utility classes shared accross the Arctic Sea.

## License
All components are licensed under the [Apache License 2.0](https://spdx.org/licenses/Apache-2.0.html).

## Changelog
... can be found on the [release page](https://github.com/52North/arctic-sea/releases).

## Quick Start
All projects are available on Maven Central.

```xml
<properties>
  <version.arctic-sea>7.2.0</version.arctic-sea>
</properties>
<dependencies>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>faroe</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>faroe-annotations</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>faroe-json</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>faroe-utils</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland-statistics</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland-statistics-generator</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland-statistics-geolocation</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>iceland-statistics-kibana</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>janmayen</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>shetland</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>shetland-rdf</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-exi</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-json</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-json-common</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-odata</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-xmlbeans</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId>svalbard-xmlstream</artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
  <dependency>
    <groupId>org.n52.arctic-sea</groupId>
    <artifactId></artifactId>
    <version>${version.arctic-sea}</version>
  </dependency>
</dependencies>
```

For convenience the [52°North Maven parent](https://github.com/52North/maven-parents) can be used:
```xml
<parent>
    <groupId>org.n52</groupId>
    <artifactId>parent</artifactId>
    <version>15</version>
</parent>
```

Development versions can be optained from the Sonatype OSS snapshot repository:
```xml
<repositories>
  <repository>
    <id>sonatype-nexus-snapshots</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
<properties>
  <version.arctic-sea>7.3.0-SNAPSHOT</version.arctic-sea>
</properties>
```

For details on how to use the components, consult their respective documentation.

## Contact

If you encounter any issues with the software or if you would like to see certain functionality added, let us know:

* Christian Autermann (c.autermann@52north.org)
* Carsten Hollmann (c.hollmann@52north.org)

## Support

You can get support in the [community mailing list and forums](https://52north.org/discuss/#mailing-lists).

## Contribute
Are you interested in contributing to the 52°North Arctic Sea and you would like to pull your changes to the 52N repository to have them available to all?

In that case we need your official permission and for this purpose we have a so-called contributors license agreement (CLA) in place. With this agreement you grant us the rights to use and publish your code under an open source license.

A link to the contributors license agreement and further explanations are available [here](https://52north.org/software/licensing/guidelines/).


## Credits

The development of the 52°North Faroe implementation was supported by several organizations and projects. Among other we would like to thank the following organizations and project

| Project/Logo | Description |
| :-------------: | :------------- |
| <a target="_blank" href="http://www.nexosproject.eu/"><img alt="NeXOS - Next generation, Cost-effective, Compact, Multifunctional Web Enabled Ocean Sensor Systems Empowering Marine, Maritime and Fisheries Management" align="middle" width="172" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/logo_nexos.png" /></a> | The development of this version of the 52&deg;North Faroe was supported by the <a target="_blank" href="http://cordis.europa.eu/fp7/home_en.html">European FP7</a> research project <a target="_blank" href="http://www.nexosproject.eu/">NeXOS</a> (co-funded by the European Commission under the grant agreement n&deg;614102) |
| <a target="_blank" href="https://bmbf.de/"><img alt="BMBF" align="middle"  src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/bmbf_logo_en.png"/></a><a target="_blank" href="https://colabis.de/"><img alt="COLABIS - Collaborative Early Warning Information Systems for Urban Infrastructures" align="middle"  src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/colabis.png"/></a> | The development of this version 52&deg;North Faroe was supported by the <a target="_blank" href="https://www.bmbf.de"> German Federal Ministry of Education and Research</a> research project <a target="_blank" href="https://colabis.de/">COLABIS</a> (co-funded by the German Federal Ministry of Education and Research, programme Geotechnologien, under grant agreement no. 03G0852A) |
| <a target="_blank" href="https://www.seadatanet.org/About-us/SeaDataCloud/"><img alt="SeaDataCloud" align="middle" width="156" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/LOGO_SDC_Layer_opengraphimage.png"/></a> | The development of this version of the 52&deg;North SOS was supported by the <a target="_blank" href="https://ec.europa.eu/programmes/horizon2020/">Horizon 2020</a> research project <a target="_blank" href="https://www.seadatanet.org/About-us/SeaDataCloud/">SeaDataCloud</a> (co-funded by the European Commission under the grant agreement n&deg;730960) |
| <a target="_blank" href="http://www.odip.org"><img alt="ODIP II - Ocean Data Interoperability Platform" align="middle" width="100" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/odip-logo.png"/></a> | The development of this version of the 52&deg;North Faroe was supported by the <a target="_blank" href="https://ec.europa.eu/programmes/horizon2020/">Horizon 2020</a> research project <a target="_blank" href="http://www.odip.org/">ODIP II</a> (co-funded by the European Commission under the grant agreement n&deg;654310) |
| <a target="_blank" href="http://www.connectingeo.net/"><img alt="ConnectinGEO - Coordinating an Observation Network of Networks EnCompassing saTellite and IN-situ to fill the Gaps in European Observations" align="middle" width="100" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/ConnectinGEO_logo.png"/></a> | The development of this version of the 52&deg;North Faroe was supported by the <a target="_blank" href="https://ec.europa.eu/programmes/horizon2020/">Horizon 2020</a> research project <a target="_blank" href="http://www.connectingeo.net/">ConnectinGEO</a> (co-funded by the European Commission under the grant agreement n&deg;641538) |
| <a target="_blank" href="http://www.geoviqua.org/"><img alt="GeoViQua - QUAlity aware VIsualization for the Global Earth Observation System of Systems" align="middle" width="172" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/logo_geoviqua.png"/></a> | The development of this version 52&deg;North Faroe was supported by the <a target="_blank" href="http://cordis.europa.eu/fp7/home_en.html">European FP7</a> research project <a href="http://www.geoviqua.org/" title="GeoViQua">GeoViQua</a> (co-funded by the European Commission under the grant agreement n&deg;265178) |
| <a target="_blank" href="https://www.bmvi.de/"><img alt="BMVI" align="middle" width="100" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/bmvi-logo-en.png"/></a><a target="_blank" href="https://www.bmvi.de/DE/Themen/Digitales/mFund/Ueberblick/ueberblick.html"><img alt="mFund" align="middle" width="100" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/mFund.jpg"/></a><a target="_blank" href="http://wacodis.fbg-hsbo.de/"><img alt="WaCoDis - Water management Copernicus services for the determination of substance inputs into waters and dams within the framework of environmental monitoring" align="middle" width="126" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/wacodis-logo.png"/></a> | The development of this version of the 52&deg;North SOS was supported by the <a target="_blank" href="https://www.bmvi.de/"> German Federal Ministry of of Transport and Digital Infrastructure</a> research project <a target="_blank" href="http://wacodis.fbg-hsbo.de/">WaCoDis</a> (co-funded by the German Federal Ministry of Transport and Digital Infrastructure, programme mFund) |
| <a target="_blank" href="https://bmbf.de/"><img alt="BMBF" align="middle" width="100" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/bmbf_logo_neu_eng.png"/></a><a target="_blank" href="https://www.fona.de/"><img alt="FONA" align="middle" width="100" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/fona.png"/></a><a target="_blank" href="https://colabis.de/"><img alt="Multidisciplinary data acquisition as the key for a globally applicable water resource management (MuDak-WRM)" align="middle" width="100" src="https://raw.githubusercontent.com/52North/arctic-sea/master/etc/images/mudak_wrm_logo.png"/></a> | The development of this version of the 52&deg;North SOS was supported by the <a target="_blank" href="https://www.bmbf.de/"> German Federal Ministry of Education and Research</a> research project <a target="_blank" href="http://www.mudak-wrm.kit.edu/">MuDak-WRM</a> (co-funded by the German Federal Ministry of Education and Research, programme FONA) |
