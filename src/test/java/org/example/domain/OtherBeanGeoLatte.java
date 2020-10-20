package org.example.domain;


import org.geolatte.geom.G2D;
import org.geolatte.geom.LineString;
import org.geolatte.geom.MultiLineString;
import org.geolatte.geom.MultiPoint;
import org.geolatte.geom.MultiPolygon;
import org.geolatte.geom.Point;
import org.geolatte.geom.Polygon;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mybean")
public class OtherBeanGeoLatte extends BaseEntity {

  String name;

  Point<G2D> point;

  Polygon<G2D> poly;

  LineString<G2D> lineString;

  MultiLineString<G2D> multiLineString;

  MultiPoint<G2D> multiPoint;

  MultiPolygon<G2D> mpoly;

  MultiPolygon<G2D> mpoly2;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Point<G2D> getPoint() {
    return point;
  }

  public void setPoint(Point<G2D> point) {
    this.point = point;
  }

  public Polygon<G2D> getPoly() {
    return poly;
  }

  public void setPoly(Polygon<G2D> poly) {
    this.poly = poly;
  }

  public MultiPolygon<G2D> getMpoly() {
    return mpoly;
  }

  public void setMpoly(MultiPolygon<G2D> mpoly) {
    this.mpoly = mpoly;
  }

  public LineString<G2D> getLineString() {
    return lineString;
  }

  public void setLineString(LineString<G2D> lineString) {
    this.lineString = lineString;
  }

  public MultiLineString<G2D> getMultiLineString() {
    return multiLineString;
  }

  public void setMultiLineString(MultiLineString<G2D> multiLineString) {
    this.multiLineString = multiLineString;
  }

  public MultiPoint<G2D> getMultiPoint() {
    return multiPoint;
  }

  public void setMultiPoint(MultiPoint<G2D> multiPoint) {
    this.multiPoint = multiPoint;
  }

  public MultiPolygon<G2D> getMpoly2() {
    return mpoly2;
  }

  public void setMpoly2(final MultiPolygon<G2D> mpoly2) {
    this.mpoly2 = mpoly2;
  }
}
