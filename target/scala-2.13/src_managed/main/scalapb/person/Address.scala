// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package person

@SerialVersionUID(0L)
final case class Address(
    street: _root_.scala.Predef.String = "",
    city: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Address] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = street
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = city
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = street
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = city
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withStreet(__v: _root_.scala.Predef.String): Address = copy(street = __v)
    def withCity(__v: _root_.scala.Predef.String): Address = copy(city = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = street
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = city
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(street)
        case 2 => _root_.scalapb.descriptors.PString(city)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = person.Address
}

object Address extends scalapb.GeneratedMessageCompanion[person.Address] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[person.Address] = this
  def merge(`_message__`: person.Address, `_input__`: _root_.com.google.protobuf.CodedInputStream): person.Address = {
    var __street = `_message__`.street
    var __city = `_message__`.city
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __street = _input__.readStringRequireUtf8()
        case 18 =>
          __city = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    person.Address(
        street = __street,
        city = __city,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[person.Address] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      person.Address(
        street = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        city = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PersonProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PersonProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = person.Address(
    street = "",
    city = ""
  )
  implicit class AddressLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, person.Address]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, person.Address](_l) {
    def street: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.street)((c_, f_) => c_.copy(street = f_))
    def city: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.city)((c_, f_) => c_.copy(city = f_))
  }
  final val STREET_FIELD_NUMBER = 1
  final val CITY_FIELD_NUMBER = 2
  def of(
    street: _root_.scala.Predef.String,
    city: _root_.scala.Predef.String,
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.person.Address = _root_.person.Address(
    street,
    city,
    unknownFields
  )
}
