from .models import Proveedor, Producto, Cliente, Comentario
from rest_framework import serializers
from django.contrib.auth.models import User


class ProveedorSerializer(serializers.ModelSerializer):
    #user = UserSerializer(read_only=True)
    class Meta:
        model = Proveedor
        fields = '__all__'
        
class ProductoSerializer(serializers.ModelSerializer):
    class Meta:
        model = Producto
        fields = '__all__'

class ClienteSerializer(serializers.ModelSerializer):
    #user = UserSerializer(read_only=True)
    class Meta:
        model = Cliente
        fields = '__all__'
        
class ComentarioSerializer(serializers.ModelSerializer):
    class Meta:
        model = Comentario
        fields = '__all__'


class UserCreationSerializer(serializers.ModelSerializer):
    class Meta:
        model = User
        fields = '__all__'


class UserSerializer(serializers.ModelSerializer):
    class Meta:
        model = User
        fields = ['id', 'username', 'email']





class UserClienteSerializer(serializers.ModelSerializer):
    cliente = ClienteSerializer()
    class Meta:
        model = User
        fields = ['id', 'username', 'email', 'cliente']

class UserProveedorSerializer(serializers.ModelSerializer):
    proveedor = ProveedorSerializer()
    class Meta:
        model = User
        fields = ['id', 'username', 'email', 'proveedor']