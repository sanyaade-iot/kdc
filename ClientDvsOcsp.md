# Appel au serveur OCSP #

La classe `org.kiwi.dictao.clients.dvs.ocsp` permet de vérifier l'état d'un certificat par un appel à un serveur OCSP conforme à la norme RFC 5019 (http://www.ietf.org/rfc/rfc5019.txt).
Elle peut être utilisée vers un serveur OCSP conforme à la norme RFC 2560 (http://www.ietf.org/rfc/rfc2560.txt) mais ne permet pas d'envoyer plusieurs certificat dans la même requête.

## Usage ##

```
Client org.kiwi.dictao.clients.dvs.ocsp
=======================================

 --ws-uri URL        : Adresse du WebService

 --certificat FILE   : Certificat à vérifier
 --ca-file FILE      : Emetteur du certificat à vérifier
 --va-file FILE      : (optionnel) Certificat publique de signature OCSP

 --keystore FILE     : (optionnel) Certificat de connexion au WebService
 --keystore-pass VAL : (optionnel) Mot de passe du catalogue de certificat de confiance pour le serveur
 --keystore-type VAL : (optionnel) Type de certificat de connexion au WebService (JKS/PKCS12)
 --truststore FILE   : (optionnel) Catalogue de certificats de confiance (TrustStore au format JKS)

 --wsdl-uri URL      : (optionnel) URI du WSDL
 --messages-soap     : (optionnel) Montrer les message SOAP
```

### Remarques : ###
  * Les arguments de `keystore` et `truststore` n'ont d’intérêt que lors de l’interrogation d'un serveur OCSP en SSL
  * Les arguments `wsdl-uri` et `messages-soap` sont ignorés lors de l'utilisation en OCSP (ils proviennent d'un héritage)

## Exemple ##

### Appel ###

```
java -classpath ../lib/args4j-*.jar;../lib/bcprov-jdk*-*.jar;../dist/kdc.jar ^
org.kiwi.dictao.clients.dvs.ocsp ^
--ws-uri http://windows-d.vm.nirvana.local:24080/DVSInterface/DVSInterfaceOCSP.cgi ^
--certificat echantillons/certificats/KiwiDVSSuperAdmin.crt ^
--ca-file echantillons/certificats/KiwiDVSCa.pem ^
--va-file certificats/kiwi/DVS_Signature_OCSP.crt ^
%*
```

### Sortie ###

```
Client org.kiwi.dictao.clients.dvs.ocsp
=======================================
URI WebService: http://windows-d.vm.nirvana.local:24080/DVSInterface/DVSInterfaceOCSP.cgi

Certificat à vérifier
=====================
Fichier certificat : echantillons\certificats\KiwiDVSSuperAdmin.crt
DN certificat      : CN=DVS Super Administrateur, O=Gentil Kiwi Network, C=FR
Validité           : Thu Feb 03 21:39:39 CET 2011 -> Sun Jan 31 21:39:39 CET 2021
Numéro de série    : 65569
Emetteur           : CN=AC Internals Tests, O=Gentil Kiwi Network, C=FR

Certificat émetteur
===================
Fichier certificat : echantillons\certificats\KiwiDVSCa.pem
DN certificat      : CN=AC Internals Tests, O=Gentil Kiwi Network, C=FR
Validité           : Thu Feb 03 21:39:39 CET 2011 -> Sun Jan 31 21:39:39 CET 2021
Numéro de série    : 65562
Emetteur           : EMAILADDRESS=benjamin@gentilkiwi.com, CN=AC Gentil Kiwi Network, O=Gentil Kiwi Network, C=FR

Certificat de signature OCSP (validation)
=========================================
Fichier certificat : certificats\kiwi\DVS_Signature_OCSP.crt
DN certificat      : CN=DVS Signature OCSP, O=Gentil Kiwi Network, C=FR
Validité           : Thu Feb 03 21:39:39 CET 2011 -> Sun Jan 31 21:39:39 CET 2021
Numéro de série    : 65565
Emetteur           : CN=AC Internals Tests, O=Gentil Kiwi Network, C=FR

Requête OCSP
============
Code retour HTTP : 200
Temps de réponse de la couche d'appel WebService : 203 ms

Réponse org.kiwi.dictao.responses.dvs.ocsp
==========================================
Status : 0 (0[16], 0[2])
 [+] Succès
Version OCSP               : 1
Date de la réponse         : Mon Nov 14 00:17:29 CET 2011
Algorithme de signature    : SHA1WITHRSA (1.2.840.113549.1.1.5)
Signature valide           : OK

        Certificat         : 65569
        Etat               : OK
        Algorithme de Hash : 1.3.14.3.2.26 (SHA1)
        Nom émeteur        : D0AF21A1660F19A7539990F897EDFA0C439C3E79
        Clé Emeteur        : 0E3B16F5D0899B23617E4202FADEFCFA997B94D3
        Mise à jour        : Mon Nov 14 00:17:29 CET 2011, prochaine : null
```