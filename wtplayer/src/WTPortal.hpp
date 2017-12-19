#pragma once

#include "WTGroup.hpp"

class WTBitmap;
class WTCamera;
class WTSurfaceShader;

class WTPortal : public WTGroup {

public:
  void setMappingOption(int mappingOption,
                        float zScale = 100);

  void setCamera(WTCamera* newPCam);

  void setDoubleSided(bool doubleSided);

  void setCustomTransform(int transformOption,
                          float xAxis,
                          float yAxis,
                          float zAxis);

  void setTexture(WTBitmap* pBitmap,
                  int newAlpha = 255);

  void setRenderOnlyChildren(bool renderOnlyChildren);

  WTCamera* getCamera();

  void setSurfaceShader(WTSurfaceShader* pShader,
                        int newAlpha = 255);
};