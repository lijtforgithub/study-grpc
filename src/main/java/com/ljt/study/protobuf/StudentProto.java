// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package com.ljt.study.protobuf;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface studentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:student)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    int getAge();

    /**
     * <code>repeated .course course = 3;</code>
     */
    java.util.List<com.ljt.study.protobuf.CourseProto.course> 
        getCourseList();
    /**
     * <code>repeated .course course = 3;</code>
     */
    com.ljt.study.protobuf.CourseProto.course getCourse(int index);
    /**
     * <code>repeated .course course = 3;</code>
     */
    int getCourseCount();
    /**
     * <code>repeated .course course = 3;</code>
     */
    java.util.List<? extends com.ljt.study.protobuf.CourseProto.courseOrBuilder> 
        getCourseOrBuilderList();
    /**
     * <code>repeated .course course = 3;</code>
     */
    com.ljt.study.protobuf.CourseProto.courseOrBuilder getCourseOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code student}
   */
  public static final class student extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:student)
      studentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use student.newBuilder() to construct.
    private student(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private student() {
      name_ = "";
      course_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new student();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private student(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              age_ = input.readInt32();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                course_ = new java.util.ArrayList<com.ljt.study.protobuf.CourseProto.course>();
                mutable_bitField0_ |= 0x00000001;
              }
              course_.add(
                  input.readMessage(com.ljt.study.protobuf.CourseProto.course.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          course_ = java.util.Collections.unmodifiableList(course_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ljt.study.protobuf.StudentProto.internal_static_student_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ljt.study.protobuf.StudentProto.internal_static_student_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ljt.study.protobuf.StudentProto.student.class, com.ljt.study.protobuf.StudentProto.student.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }

    public static final int COURSE_FIELD_NUMBER = 3;
    private java.util.List<com.ljt.study.protobuf.CourseProto.course> course_;
    /**
     * <code>repeated .course course = 3;</code>
     */
    @java.lang.Override
    public java.util.List<com.ljt.study.protobuf.CourseProto.course> getCourseList() {
      return course_;
    }
    /**
     * <code>repeated .course course = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.ljt.study.protobuf.CourseProto.courseOrBuilder> 
        getCourseOrBuilderList() {
      return course_;
    }
    /**
     * <code>repeated .course course = 3;</code>
     */
    @java.lang.Override
    public int getCourseCount() {
      return course_.size();
    }
    /**
     * <code>repeated .course course = 3;</code>
     */
    @java.lang.Override
    public com.ljt.study.protobuf.CourseProto.course getCourse(int index) {
      return course_.get(index);
    }
    /**
     * <code>repeated .course course = 3;</code>
     */
    @java.lang.Override
    public com.ljt.study.protobuf.CourseProto.courseOrBuilder getCourseOrBuilder(
        int index) {
      return course_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (age_ != 0) {
        output.writeInt32(2, age_);
      }
      for (int i = 0; i < course_.size(); i++) {
        output.writeMessage(3, course_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      for (int i = 0; i < course_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, course_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.ljt.study.protobuf.StudentProto.student)) {
        return super.equals(obj);
      }
      com.ljt.study.protobuf.StudentProto.student other = (com.ljt.study.protobuf.StudentProto.student) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getAge()
          != other.getAge()) return false;
      if (!getCourseList()
          .equals(other.getCourseList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      if (getCourseCount() > 0) {
        hash = (37 * hash) + COURSE_FIELD_NUMBER;
        hash = (53 * hash) + getCourseList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ljt.study.protobuf.StudentProto.student parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljt.study.protobuf.StudentProto.student parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.ljt.study.protobuf.StudentProto.student prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code student}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:student)
        com.ljt.study.protobuf.StudentProto.studentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ljt.study.protobuf.StudentProto.internal_static_student_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ljt.study.protobuf.StudentProto.internal_static_student_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ljt.study.protobuf.StudentProto.student.class, com.ljt.study.protobuf.StudentProto.student.Builder.class);
      }

      // Construct using com.ljt.study.protobuf.StudentProto.student.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCourseFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        age_ = 0;

        if (courseBuilder_ == null) {
          course_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          courseBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ljt.study.protobuf.StudentProto.internal_static_student_descriptor;
      }

      @java.lang.Override
      public com.ljt.study.protobuf.StudentProto.student getDefaultInstanceForType() {
        return com.ljt.study.protobuf.StudentProto.student.getDefaultInstance();
      }

      @java.lang.Override
      public com.ljt.study.protobuf.StudentProto.student build() {
        com.ljt.study.protobuf.StudentProto.student result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ljt.study.protobuf.StudentProto.student buildPartial() {
        com.ljt.study.protobuf.StudentProto.student result = new com.ljt.study.protobuf.StudentProto.student(this);
        int from_bitField0_ = bitField0_;
        result.name_ = name_;
        result.age_ = age_;
        if (courseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            course_ = java.util.Collections.unmodifiableList(course_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.course_ = course_;
        } else {
          result.course_ = courseBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ljt.study.protobuf.StudentProto.student) {
          return mergeFrom((com.ljt.study.protobuf.StudentProto.student)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ljt.study.protobuf.StudentProto.student other) {
        if (other == com.ljt.study.protobuf.StudentProto.student.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        if (courseBuilder_ == null) {
          if (!other.course_.isEmpty()) {
            if (course_.isEmpty()) {
              course_ = other.course_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCourseIsMutable();
              course_.addAll(other.course_);
            }
            onChanged();
          }
        } else {
          if (!other.course_.isEmpty()) {
            if (courseBuilder_.isEmpty()) {
              courseBuilder_.dispose();
              courseBuilder_ = null;
              course_ = other.course_;
              bitField0_ = (bitField0_ & ~0x00000001);
              courseBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCourseFieldBuilder() : null;
            } else {
              courseBuilder_.addAllMessages(other.course_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.ljt.study.protobuf.StudentProto.student parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ljt.study.protobuf.StudentProto.student) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 2;</code>
       * @return The age.
       */
      @java.lang.Override
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 2;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        
        age_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.ljt.study.protobuf.CourseProto.course> course_ =
        java.util.Collections.emptyList();
      private void ensureCourseIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          course_ = new java.util.ArrayList<com.ljt.study.protobuf.CourseProto.course>(course_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.ljt.study.protobuf.CourseProto.course, com.ljt.study.protobuf.CourseProto.course.Builder, com.ljt.study.protobuf.CourseProto.courseOrBuilder> courseBuilder_;

      /**
       * <code>repeated .course course = 3;</code>
       */
      public java.util.List<com.ljt.study.protobuf.CourseProto.course> getCourseList() {
        if (courseBuilder_ == null) {
          return java.util.Collections.unmodifiableList(course_);
        } else {
          return courseBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public int getCourseCount() {
        if (courseBuilder_ == null) {
          return course_.size();
        } else {
          return courseBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public com.ljt.study.protobuf.CourseProto.course getCourse(int index) {
        if (courseBuilder_ == null) {
          return course_.get(index);
        } else {
          return courseBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public Builder setCourse(
          int index, com.ljt.study.protobuf.CourseProto.course value) {
        if (courseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCourseIsMutable();
          course_.set(index, value);
          onChanged();
        } else {
          courseBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public Builder setCourse(
          int index, com.ljt.study.protobuf.CourseProto.course.Builder builderForValue) {
        if (courseBuilder_ == null) {
          ensureCourseIsMutable();
          course_.set(index, builderForValue.build());
          onChanged();
        } else {
          courseBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public Builder addCourse(com.ljt.study.protobuf.CourseProto.course value) {
        if (courseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCourseIsMutable();
          course_.add(value);
          onChanged();
        } else {
          courseBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public Builder addCourse(
          int index, com.ljt.study.protobuf.CourseProto.course value) {
        if (courseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCourseIsMutable();
          course_.add(index, value);
          onChanged();
        } else {
          courseBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public Builder addCourse(
          com.ljt.study.protobuf.CourseProto.course.Builder builderForValue) {
        if (courseBuilder_ == null) {
          ensureCourseIsMutable();
          course_.add(builderForValue.build());
          onChanged();
        } else {
          courseBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public Builder addCourse(
          int index, com.ljt.study.protobuf.CourseProto.course.Builder builderForValue) {
        if (courseBuilder_ == null) {
          ensureCourseIsMutable();
          course_.add(index, builderForValue.build());
          onChanged();
        } else {
          courseBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public Builder addAllCourse(
          java.lang.Iterable<? extends com.ljt.study.protobuf.CourseProto.course> values) {
        if (courseBuilder_ == null) {
          ensureCourseIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, course_);
          onChanged();
        } else {
          courseBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public Builder clearCourse() {
        if (courseBuilder_ == null) {
          course_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          courseBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public Builder removeCourse(int index) {
        if (courseBuilder_ == null) {
          ensureCourseIsMutable();
          course_.remove(index);
          onChanged();
        } else {
          courseBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public com.ljt.study.protobuf.CourseProto.course.Builder getCourseBuilder(
          int index) {
        return getCourseFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public com.ljt.study.protobuf.CourseProto.courseOrBuilder getCourseOrBuilder(
          int index) {
        if (courseBuilder_ == null) {
          return course_.get(index);  } else {
          return courseBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public java.util.List<? extends com.ljt.study.protobuf.CourseProto.courseOrBuilder> 
           getCourseOrBuilderList() {
        if (courseBuilder_ != null) {
          return courseBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(course_);
        }
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public com.ljt.study.protobuf.CourseProto.course.Builder addCourseBuilder() {
        return getCourseFieldBuilder().addBuilder(
            com.ljt.study.protobuf.CourseProto.course.getDefaultInstance());
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public com.ljt.study.protobuf.CourseProto.course.Builder addCourseBuilder(
          int index) {
        return getCourseFieldBuilder().addBuilder(
            index, com.ljt.study.protobuf.CourseProto.course.getDefaultInstance());
      }
      /**
       * <code>repeated .course course = 3;</code>
       */
      public java.util.List<com.ljt.study.protobuf.CourseProto.course.Builder> 
           getCourseBuilderList() {
        return getCourseFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.ljt.study.protobuf.CourseProto.course, com.ljt.study.protobuf.CourseProto.course.Builder, com.ljt.study.protobuf.CourseProto.courseOrBuilder> 
          getCourseFieldBuilder() {
        if (courseBuilder_ == null) {
          courseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.ljt.study.protobuf.CourseProto.course, com.ljt.study.protobuf.CourseProto.course.Builder, com.ljt.study.protobuf.CourseProto.courseOrBuilder>(
                  course_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          course_ = null;
        }
        return courseBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:student)
    }

    // @@protoc_insertion_point(class_scope:student)
    private static final com.ljt.study.protobuf.StudentProto.student DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ljt.study.protobuf.StudentProto.student();
    }

    public static com.ljt.study.protobuf.StudentProto.student getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<student>
        PARSER = new com.google.protobuf.AbstractParser<student>() {
      @java.lang.Override
      public student parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new student(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<student> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<student> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ljt.study.protobuf.StudentProto.student getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_student_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_student_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rstudent.proto\032\014course.proto\"=\n\007student" +
      "\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\027\n\006course\030\003 " +
      "\003(\0132\007.courseB&\n\026com.ljt.study.protobufB\014" +
      "StudentProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ljt.study.protobuf.CourseProto.getDescriptor(),
        });
    internal_static_student_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_student_descriptor,
        new java.lang.String[] { "Name", "Age", "Course", });
    com.ljt.study.protobuf.CourseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}